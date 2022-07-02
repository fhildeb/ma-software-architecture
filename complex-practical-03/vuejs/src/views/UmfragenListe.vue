<template>
  <div class="umfragenliste">
    <p>Hier sehen Sie alle Umfragen:</p>
    <UmfragenEintrag v-for="umfrage in all" :key="umfrage.id" :info="umfrage"
    ></UmfragenEintrag>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
import { UmfrageService, UmfrageInfo } from "@/rest/UmfrageService";
import UmfragenEintrag from '@/components/UmfragenEintrag.vue';

@Component({
  components: {
    UmfragenEintrag,
  },
})
export default class UmfragenListe extends Vue
{
  private all: UmfrageInfo[] = [];

  private async created()
  {
    this.all = await UmfrageService.listUmfragen();
  }

}
</script>

<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
