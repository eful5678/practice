<template>
  <div>
    <div>
      <form @submit.prevent="submitForm" class="form">
        <div>
          <label for="username">ID : </label>
          <input type="text" v-model="username" />
        </div>
        <div>
          <label for="password">Password : </label>
          <input type="password" />
        </div>
        <button type="submit">Login</button>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      username: '',
    };
  },
};
</script>

<style></style>
