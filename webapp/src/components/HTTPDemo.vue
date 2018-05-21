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
        console.log(this.sampleData);
      }
    }
  }
</script>

<style lang="css" scoped>

</style>
