<template>
  <div class="umfrageneintrag">
    <router-link :to="{name: 'umfrage', params: {id: info._id}}">{{info.titel}}</router-link>
  </div>
</template>

<script lang="ts">
import { Component, Prop, Vue } from 'vue-property-decorator';
import { UmfrageInfo } from '@/rest/UmfrageInfo';

@Component
export default class UmfragenEintrag extends Vue{
  @Prop() public info?: UmfrageInfo;
}
</script>

<style scoped>
.umfrageneintrag a {
  display: block;
  background: darkseagreen;
  color: black;
  margin: 0.5em 0;
  padding: 0.5em 1em;
  line-height: 2em;
  border-radius: 0.5em;
  text-decoration: none;
}

.umfrageneintrag a:hover {
  background: darksalmon;
}
</style>