<template>
  <div class="h-login-form">
    <h2 class="h-login-head">Welcome</h2>
    <form>
      <div class="form-group">
        <input type="email" class="form-control" aria-describedby="emailHelp" placeholder="Email">
      </div>
      <div class="form-group">
        <input type="password" class="form-control" placeholder="Password">
      </div>
      <button type="submit" class="btn btn-primary h-login-btn">Continue</button>
    </form>
  </div>
</template>

<script>
  export default {}
</script>

<style lang="scss" scoped>
  .h-login-form {
    width: 340px;
    background-color: #f7f7f7;
    padding: 40px 40px 60px 40px;
    -moz-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    -webkit-box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
  }
  .h-login-btn {
    width: 100%;
  }
  .h-login-head {
    text-align: center;
  }
</style>

