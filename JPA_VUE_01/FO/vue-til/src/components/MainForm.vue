<template>
  <div>
    <div class="jumbotron">
      <p>회원 기능</p>
      <p>
        <button @click="listBind">회원목록</button>
      </p>
      <p class="lead">상품 기능</p>
      <p>
        <button @click="productInsertBind">상품등록</button>
        <a href="">상품 목록</a>
      </p>
      <p>주문 기능</p>
      <p>
        <a href="">상품 주문</a>
        <a href="">주문 내역</a>
      </p>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MemberList',
  components: {},
  methods: {
    listBind: function () {
      this.$router.push('/members');
    },
    productInsertBind: function () {
      this.$router.push('BookForm');
    },
  },
};
</script>

<style></style>
