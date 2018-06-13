<template>
  <nav id="sidebar" :class="{ active: isActive}">
    <!-- Sidebar Links -->
    <ul>
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">About</a></li>
      <li>
        <!-- Link with dropdown items -->
        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false">Pages</a>
        <ul class="collapse list-unstyled" id="homeSubmenu">
          <li><a href="#">Page</a></li>
          <li><a href="#">Page</a></li>
          <li><a href="#">Page</a></li>
        </ul>
        <li><a href="#">Portfolio</a></li>
        <li><a href="#">Contact</a></li>
    </ul>
  </nav>
</template>

<script>
  export default {
    props: ['isActive']
  }
</script>

<style lang="scss" scoped>
  #sidebar {
    min-width: 250px;
    max-width: 250px;
    margin-left: -250px;
    background-color: #fff;
    border-right: solid 1px #e0e0e0;
    transition: all 0.3s;
    ul li a {
      text-decoration: none;
      display: flex;
      align-items: center;
      font-size: 13px;
      color: #000;
      font-weight: 500;
      padding: 0 16px;
      height: 40px;
    }
    ul li a:hover {
      background: rgba(0,0,0,.12);
    } 
  }
  #sidebar.active {
    margin-left: 0px;
  }
  #sidebar {
    min-width: 250px;
    max-width: 250px;
    min-height: 100vh;
  }
</style>
