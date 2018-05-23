<template>
  <div>
    This is a HTTP Demo
    <button @click="getData()">Click Me</button>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        sampleData: ''
      }
    },
    methods: {
      getData() {
        this.sampleData = 'This is some sample data';
        this.$http.get('http://localhost:8080/demo/hello/1').then(response => {
          this.sampleData = response.data;
          console.log(this.sampleData.title);
        }, errResponse => {
          console.error(errResponse)
        })
      }
    }
  }
</script>

<style lang="css" scoped>

</style>
