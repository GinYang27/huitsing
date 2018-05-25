<template>
  <div class="h-login-form">
    <h2 class="h-login-head">Welcome</h2>
    <form @submit.prevent="login">
      <div class="form-group">
        <input v-validate="'required|email'" name="email" type="email" class="form-control" placeholder="Email" v-model="email">
        <span class="h-validate-error">{{errors.first('email')}}</span>
      </div>
      <div class="form-group">
        <input v-validate="'required'" name="password" type="password" class="form-control" placeholder="Password" v-model="password">
        <span class="h-validate-error">{{errors.first('password')}}</span>
      </div>
      <button type="submit" class="btn btn-primary h-login-btn">Continue</button>
    </form>
  </div>
</template>

<script>
  import Constants from '../constants/apiUrl.js';
  export default {
    data() {
      return {
        email: '',
        password: ''
      }
    },
    methods: {
      login() {
        const apiUrl = Constants.SERVER_BASE_URL + Constants.put_login;
        const paramData = {
          email: this.email,
          password: this.password
        };
        this.$http.put(apiUrl, paramData).then(response => {
          console.log(response);
        })
      }
    }
  }
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

