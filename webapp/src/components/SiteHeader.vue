<template>
  <nav class="navbar navbar-expand-lg navbar-dark">
    <a class="navbar-brand" href="#">Hui-tsing</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <router-link class="nav-link" to="/overview">Overview</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/modules">Modules</router-link>
        </li>
        <li class="nav-item">
          <router-link class="nav-link" to="/about">About</router-link>
        </li>
      </ul>
      <!-- <form class="form-inline my-2 my-lg-0">
        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-info my-2 my-sm-0" type="submit">Search</button>
      </form> -->
    </div>
  </nav>
</template>

<script>
  export default {}
</script>

<style lang="scss" scoped>
  nav {
    box-shadow: 0 2px 4px -1px rgba(0, 0, 0, .2), 0 4px 5px 0 rgba(0, 0, 0, .14), 0 1px 10px 0 rgba(0, 0, 0, .12);
    background-color: #1565c0;
    // background-color: white;
    // opacity: 0.3;
    // position: fixed;
    .navbar-brand {
      font-size: 20px;
      font-weight: 500;
      letter-spacing: .02em;
      white-space: nowrap;
    }
  }
</style>
