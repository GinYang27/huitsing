<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script>
  import HelloWorld from './components/HelloWorld.vue'
  export default {
    name: 'app',
    components: {
      HelloWorld
    }
  }
</script>

<style lang="scss">
  * {
    outline: none;
    padding: 0;
    margin: 0;
  }
  html {
    overflow-x: hidden;
    height: 100%;
  }
  body {
    height: 100%;
    min-height: 100%;
  }
  textarea {
    resize: none;
  }
  #app {
    height: 100%;
  }
</style>
