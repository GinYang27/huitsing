<template>
  <div class="h-app-wrap">
    <site-header></site-header>
    <router-view></router-view>
    <!-- <h1>Home Page</h1>
    <ul>
      <li>
        <router-link to="/vue">Go Vue Default Page</router-link>
      </li>
      <li>
        <router-link to="/page1">Go Page1</router-link>
      </li>
      <li>
        <router-link to="/page2">Go Page2</router-link>
      </li>
      <li>
        <router-link to="/login">Login</router-link>
      </li>
    </ul> -->
  </div>
</template>

<script>
import SiteHeader from '../components/SiteHeader.vue'
export default {
  components: {
    SiteHeader
  }
}
</script>

<style lang="scss" scoped>
  .h-app-wrap {
    background-color: #fafafa;
    height: 100%;
  }
</style>


