<template>
  <div class="container h-login-container">
      <login-dialog></login-dialog>
  </div>
</template>

<script>
  import LoginDialog from '../components/Login.vue';
  export default {
    components: {
      LoginDialog
    }
  }
</script>

<style lang="scss" scoped>
  .h-login-container {
    height: 100%;
    display: flex;
    justify-content: center;
    align-items: center;
  }
</style>

