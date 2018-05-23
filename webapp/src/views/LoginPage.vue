<template>
  <div class="container h-login-container">
    This is a login page.
    <login-dialog></login-dialog>
  </div>
</template>

<script>
  import LoginDialog from '../components/Login.vue'
  export default {
    components: {
      LoginDialog
    }
  }
</script>

<style lang="scss" scoped>
  .h-login-container {
    text-align: center;
  }
</style>

