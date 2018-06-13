import Page1View from '../views/Page1.vue'
import Subpage1 from '../views/SubPage1.vue'
import Subpage2 from '../views/SubPage2.vue'
import Page2View from '../views/Page2.vue'
import HomeView from '../views/Home.vue'
import VueView from '../views/VueDefault.vue'
import LoginView from '../views/LoginPage.vue'
import Overview from '../views/Overview.vue'
import ModulesView from '../views/ModulesView.vue'
import AboutView from '../views/AboutView.vue'

export default [
  { path: '/', 
    component: HomeView,
    children: [
      { path: 'overview', component: Overview },
      { path: 'modules', component: ModulesView},
      { path: 'about', component: AboutView}
    ] 
  },
  { path: '/page1', 
    component: Page1View,
    children: [
      { path: 'sub1', component: Subpage1 },
      { path: 'sub2', component: Subpage2 }
    ]
  },
  { path: '/page2', component: Page2View },
  { path: '/vue', component: VueView},
  { path: '/login', component: LoginView}
]