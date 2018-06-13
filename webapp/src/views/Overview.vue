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
          <strong>6/11/2018 (Kansas City, MO, USA)</strong> 
          This website is created to note some web development technologies, 
          including database, front-end development, back-end development, UI design and algorithm. 
          I will list each of these technologis in some modules,with a DEMO. 
          In the future, I wish this can be platform for web developer to communicate and create great product.
        </p>
      </section>
      <section class="container h-third-sec">
        <div class="h-tech-wrapper" v-for="(tech, i) in techLogos" :key="i">
          <img :src="tech.image" :alt="tech">
          <p>{{tech.name}}</p>
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
        {
          name: 'Vue.js',
          image: require('../assets/tech/tech_vue.png')
        },{
          name: 'JavaScript',
          image: require('../assets/tech/tech_js.jpeg')
        },{
          name: 'jQuery',
          image: require('../assets/tech/tech_jquery.png')
        },{
          name: 'Webpack',
          image: require('../assets/tech/tech_webpack.png')
        },{
          name: 'Bootstrap',
          image: require('../assets/tech/tech_bootstrap.png')
        },{
          name: 'Java',
          image: require('../assets/tech/tech_java.png')
        },{
          name: 'MySQL',
          image: require('../assets/tech/tech_mysql.png')
        },{
          name: 'Firebase',
          image: require('../assets/tech/tech_firebase.jpg')
        },{
          name: 'Amazon EBS',
          image: require('../assets/tech/tech_ebs.png')
        },{
          name: 'Amazon EC2',
          image: require('../assets/tech/tech_ec2.png')
        },{
          name: 'Amazon RDS',
          image: require('../assets/tech/tech_rds.png')
        },{
          name: 'Amazon S3',
          image: require('../assets/tech/tech_s3.png')
        },{
          name: 'nginx',
          image: require('../assets/tech/tech_nginx.png')
        },{
          name: 'GitHub',
          image: require('../assets/tech/tech_github.png')
        }
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
    padding: 150px;
    p {
      line-height: 3em;
      padding: 10px;
    }
  }
  .h-third-sec {
    display: flex;
    flex-wrap: wrap;
    padding: 80px 0px;
    img {
      width: 100px;
    }
    .h-tech-wrapper {
      margin: 15px;
      p {
        text-align: center;
        color: white;
        font-weight: 600;
      }
    }
    
  }
</style>

