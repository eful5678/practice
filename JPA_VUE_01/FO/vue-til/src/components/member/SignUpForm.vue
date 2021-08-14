<template>
  <div class="container">
    <div>
      <label for="name">이름</label>
      <input
        type="text"
        v-model="member.username"
        placeholder="이름을 입력해주세요."
      />
    </div>
    <div>
      <label for="city">도시</label>
      <input
        type="text"
        v-model="member.city"
        placeholder="도시를 입력해주세요"
      />
    </div>
    <div>
      <label for="street">거리</label>
      <input
        type="text"
        v-model="member.street"
        placeholder="거리를 입력해주세요"
      />
    </div>
    <div>
      <label for="zipcode">우편번호</label>
      <input
        type="text"
        v-model="member.zipcode"
        placeholder="우편번호를 입력해주세요"
      />
    </div>
    <div>
      <button @click="insert">회원가입</button>
    </div>
  </div>
</template>

<script>
import { Login } from '@/resources/entity/member';
export default {
  name: 'SignUpForm.vue',
  components: {},
  data: () => ({
    member: {
      class: new Login(),
    },
  }),
  methods: {
    insert: function () {},
  },
};
</script>

<style></style>
