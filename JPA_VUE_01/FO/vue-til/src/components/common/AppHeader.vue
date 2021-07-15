<template>
  <header>
    <div>
      <router-link to="/" class="logo"> HI,HI </router-link>
      <button @click="mainBind">Go main</button>
    </div>
  </header>
</template>

<script>
export default {
  methods: {
    mainBind: function () {
      this.$router.push('/main');
    },
  },
};
</script>

<style></style>
