<template>
  <div class="wrapper">
    <side-bar :is-active="isActive"></side-bar>
    <div>
      <button type="button" @click="isActive = !isActive">
        <i v-show="isActive" class="fas fa-arrow-left"></i>
        <i v-show="!isActive" class="fas fa-arrow-right"></i>
      </button>
    </div>
  </div>
</template>

<script>
  import SideBar from '../components/Sidebar.vue'
  export default {
    components: {
      SideBar
    },
    data() {
      return {
        isActive: true
      }
    }
  }
</script>

<style lang="scss">
  .wrapper {
    display: flex;
    align-items: stretch;
  }
 
</style>

