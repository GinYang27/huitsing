import Vue from 'vue'
import VueRouter from 'vue-router'
import VueResource from 'vue-resource'
import App from './App.vue'
import Routes from './router'

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
