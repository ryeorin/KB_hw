import { createRouter, createWebHistory, isNavigationFailure } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import NotFound from '@/pages/Notfound.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue'),
    },
    {path:'/:path(.*)*', name: 'NotFound', component: NotFound},
    {path:'/members/:id', name:'members/id',component:MemberInfo, beforeEnter:memebersIdGuard},
    {path: '/videos',name:'videos',component:Videos},
    {path:'/videos',name:'videos',component:Videos,
      children:[
        {path:':id', name:'videos/id',component:VideoPlayer}
      ]
    },
  ]
})

const  membersIdGuard = (to, from) => {
  // members/:id 경로는반드시이전경로가
 // /members, /members:id인경우만내비게이션허용함
 if (from.name !== "members" && from.name !== "members/id") {
  return false;
  }
}


export default router
