import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import App from './App.vue'
import Routes from './router'

import('../node_modules/bootstrap/dist/js/bootstrap.min.js')
import('../node_modules/bootstrap/dist/css/bootstrap.min.css')

Vue.config.productionTip = false

Vue.use(VueRouter)
Vue.use(VueResource);

const router = new VueRouter({
  routes: Routes,
  mode: 'history'
})

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
