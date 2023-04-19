<template>
  <div>
    <div
      v-if="umfrage"
      class="umfrage"
    >
      <p>{{umfrage.text}}</p>
      <ul :class="{editable: editable}">
        <li
          v-for="(antwort, index) in umfrage.antworten"
          :key="antwort"
          :class="{active: isActive(index)}"
          :style="{width: getPercent(index)+'%'}"
          @click="clicked(index)"
        >
          <div class="antwort">{{antwort}}</div>
          <div class="count">{{stats[index]}}</div>
        </li>
      </ul>

      <router-link
        v-if="!editable"
        :to="{name: 'home'}"
      >Zurück</router-link>

    </div>
    <p v-if="errortext">Folgender Fehler ist aufgetreten: {{errortext}}</p>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from "vue-property-decorator";
import axios, { AxiosRequestConfig, AxiosResponse } from "axios";
import { UmfrageService, Umfrage } from '@/rest/UmfrageService';

@Component({
  components: {
  },
})
export default class UmfrageDetail extends Vue
{
  private umfrage: Umfrage | null = null;
  private errortext: string | null = null;
  private active: number = -1;
  private stats: number[] = [];

  private async created()
  {
    const id = this.$route.params.id;
    try
    {
      this.umfrage = await UmfrageService.getUmfrage(id);
    }
    catch (e)
    {
      this.errortext = "Leider wurde diese Umfrage nicht gefunden.";
    }
  }

  private get editable(): boolean
  {
    return this.active === -1;
  }

  private isActive(nr: number): boolean
  {
    return this.active === nr;
  }

  private getPercent(nr: number): number
  {
    const max = Math.max(0, ...this.stats);
    console.log(max);
    return max === 0 ? 100 : this.stats[nr] / max * 100;
  }

  private async clicked(nr: number)
  {
    if (!this.editable || !this.umfrage)
    {
      return;
    }

    try
    {
      this.active = nr;
      await UmfrageService.vote(this.umfrage, nr);
      this.stats = await UmfrageService.getStats(this.umfrage);
      this.errortext = null;
    }
    catch (e)
    {
      this.active = -1;
      this.errortext = e;
    }
  }
}
</script>

<style scoped>
ul {
  list-style-type: none;
  padding: 0px;
}

ul li {
  display: flex;
  box-sizing: border-box;
  text-decoration: none;
  background: darkseagreen;
  color: black;
  margin: 0.5em 0;
  padding: 0.5em 1em;
  line-height: 2em;
  border-radius: 0.5em;
  transition: width 2.5s ease;
}

ul.editable li {
  cursor: pointer;
}

ul.editable li:hover,
ul li.active {
  background: darksalmon;
}

ul li.active {
  font-weight: bold;
}

div.antwort {
  flex-grow: 1;
}

div .count {
  margin: 0em 0em 0em 1em;
}
</style>
