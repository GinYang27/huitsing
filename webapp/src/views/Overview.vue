<template>
  <div class="h-ov-canvas">
    <div>
      <section class="h-first-sec">
        <img src="../assets/shiba_logo.png" alt="Hui-tsing Logo">
        <h1>Hui-Tsing.com</h1>
        <h6>Created by Jin Yang</h6>
        <button type="button" class="btn btn-primary">GET STARTED</button>
      </section>
      <section class="h-second-sec">
        <p class="container">
          Log 6/11/2018 (Kansas City, MO, USA) <br>
          This website is created to note some web development technologies, 
          including database, front-end development, back-end development, UI design and algorithm. 
          I will list each of these technologis in some modules,with a DEMO. 
          In the future, I wish this can be platform for web developer to communicate and create great product.
        </p>
      </section>
      <section class="container h-third-sec">
        <div class="h-tech-wrapper" v-for="(tech, i) in techLogos" :key="i">
          <img :src="tech" :alt="tech">
        </div>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      techLogos: [
        require('../assets/tech/tech_vue.png'),
        require('../assets/tech/tech_js.jpeg'),
        require('../assets/tech/tech_jquery.png'),
        require('../assets/tech/tech_webpack.png'),
        require('../assets/tech/tech_npm.png'),
        require('../assets/tech/tech_bootstrap.png'),
        require('../assets/tech/tech_java.png'),
        require('../assets/tech/tech_mysql.png'),
        require('../assets/tech/tech_firebase.jpg'),
        require('../assets/tech/tech_ebs.png'),
        require('../assets/tech/tech_ec2.png'),
        require('../assets/tech/tech_rds.png'),
        require('../assets/tech/tech_s3.png'),
        require('../assets/tech/tech_nginx.png'),
        require('../assets/tech/tech_github.png')
      ]
    }
  }
}
</script>


<style lang="scss" scoped>
  .h-ov-canvas {
    background-image: url("../assets/hero.jpeg");
    background-repeat: no-repeat;
    background-attachment: fixed;
    height: 100%;
  }
  .h-first-sec {
    padding: 80px 0px;
    img {
      width: 150px;
    }
    text-align: center;
    color: white;
  }
  .h-second-sec {
    background-color: white;
    height: 100%;
  }
  .h-third-sec {
    display: flex;
    flex-wrap: wrap;
    img {
      width: 100px;
    }
    .h-tech-wrapper {
      margin: 15px;
    }
    
  }
</style>

