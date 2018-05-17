<template>
  <div>
    <h2>Page1</h2>
    <ul>
      <li>
        <router-link to="/page1/sub1">Go SubPage1</router-link>
      </li>
      <li>
        <router-link to="/page1/sub2">Go SubPage2</router-link>
      </li>
    </ul>
    <router-view></router-view>
  </div>
</template>

<script>
export default {
  
}
</script>

