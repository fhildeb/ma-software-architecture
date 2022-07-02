import Vue from 'vue';
import Router from 'vue-router';
import UmfragenListe from '@/views/UmfragenListe.vue';
import UmfrageDetail from '@/views/UmfrageDetail.vue';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: UmfragenListe,
    },
    {
      path: '/umfrage/:id',
      name: 'umfrage',
      component: UmfrageDetail,
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue'),
    },
  ],
});
