import Vue from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/',
      redirect: '/login',
    },
    {
      path: '/login',
      component: () => import('@/views/LoginPage.vue'),
    },
    {
      path: '/main',
      component: () => import('@/views/MainPage.vue'),
    },
    {
      path: '/signup',
      name: 'SignUpForm',
      component: () => import('@/views/SignUpPage.vue'),
    },
    {
      path: '/members',
      component: () => import('@/components/member/MemberList.vue'),
    },
    {
      path: '/BookForm',
      name: 'BookForm',
      component: () => import('@/components/product/BookForm.vue'),
    },
  ],
});

router.beforeEach((to, from, next) => {
  next();
});

export default router;
