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
        <div class="container">
          <h1 class="h-home-title"> Welcome to Hui-tsing.com</h1>
          <p class="h-home-subtitle"> This website is created to note some web development technologies, 
          including database, front-end development, back-end development, UI design and algorithm. 
          I will list each of these technologis in some modules,with a DEMO. 
          In the future, I wish this can be platform for web developers to communicate and create great product.
          </p>
         
        </div>
      </section>
      <section class="container h-third-sec">
        <div class="h-tech-wrapper" v-for="(tech, i) in techLogos" :key="i">
          <img :src="tech.image" :alt="tech">
          <p>{{tech.name}}</p>
        </div>
      </section>
      <section class="h-fourth-sec">
        <!-- <about-me></about-me> -->
        <div class="container">
          <h1 class="h-home-title">Hi, <span>I'm</span> Jin Yang</h1>
          <p class="h-home-subtitle">
            I'm a full-stack web developer based in Missouri, USA. <br>
            I graduate from Stevens Institute of Technology in New Jersey. <br>
            I have worked with startups in areas such as E-commerce, Administrative dashboard and Reservation system. <br>
            If you'd like to get in touch feel free to send me an email(gin.yang17@gmail.com).
          </p>
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
  .h-second-sec, .h-fourth-sec {
    background-color: white;
    padding: 80px 0px;
    color: black;
  }
  .h-third-sec {
    display: flex;
    flex-wrap: wrap;
    padding: 80px 0px;
    justify-content: space-around;
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
  .h-home-title {
    color: #4d2460;
    text-align: center;
    letter-spacing: 1px;
    font-size: 68px;
    font-weight: 400;
    span {
      color: black;
    }
  }
  .h-home-subtitle {
    text-transform: uppercase;
    font-size: 18px;
    text-align: center;
    margin-top: 20px;
    line-height: 3em;
  }
  @media screen and (max-width: 600px) {
    .h-first-sec {
      padding: 50px 0px;
    }
    .h-home-title {
      font-size: 40px;
    }
    .h-third-sec {
      img {
        width: 80px;
      }
      .h-tech-wrapper {
        margin: 15px;
        p {
          font-size: 12px;
        }
      }
    }
  }
</style>

