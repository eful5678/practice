<template>
  <div>
    <div>
      <div>
        <label for="username">ID : </label>
        <input type="text" v-model="member.class.username" />
        {{ member.class.username }}
      </div>
      <div>
        <label for="password">Password : </label>
        <input type="password" />
      </div>
      <div>
        <button type="submit" @click="login">Login</button>
        <button @click="insertBind">Join</button>
      </div>
    </div>
  </div>
</template>

<script>
import { Login } from '@/resources/entity/member';
export default {
  data: () => ({
    member: {
      class: new Login(),
    },
  }),
  methods: {
    insertBind: function () {
      this.$router.push('/signup');
    },
    login: function () {
      console.log(this.member.class.username);
    },
  },
};
</script>

<style></style>
