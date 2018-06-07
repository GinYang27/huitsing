import Vue from 'vue';
import VueRouter from 'vue-router';
import VueResource from 'vue-resource';
import VeeValidate from 'vee-validate';
import App from './App.vue';
import Routes from './router';

import('../node_modules/bootstrap/dist/js/bootstrap.min.js');

Vue.config.productionTip = false;

Vue.use(VueRouter);
Vue.use(VueResource);
Vue.use(VeeValidate);

const router = new VueRouter({
  routes: Routes,
  mode: 'history'
})

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
