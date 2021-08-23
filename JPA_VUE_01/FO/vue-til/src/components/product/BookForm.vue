<template>
  <div>
    <div>
      <label for="상품명">상품명</label>
      <input type="text" v-model="book.class.name" />
    </div>
    <div>
      <label for="가격">가격</label>
      <input type="text" v-model="book.class.price" />
    </div>
    <div>
      <label for="수량">수량</label>
      <input type="text" v-model="book.class.stockQuantity" />
    </div>
    <div>
      <label for="저자">저자</label>
      <input type="text" v-model="book.class.author" />
    </div>
    <div>
      <label for="ISBN">ISBN</label>
      <input type="text" v-model="book.class.isbn" />
    </div>
    <div>
      <button @click="insert">상품 등록</button>
    </div>
  </div>
</template>

<script>
import { book } from '@/resources/entity/product';
import { instance } from '@/api/index';
export default {
  name: 'BookForm',
  data: () => ({
    book: {
      class: new book(),
    },
  }),
  methods: {
    insert: function () {
      console.log('product insert');
      instance.post('/items/new', this.book.class.insert());
      this.$router.push('/main');
    },
  },
};
</script>

<style></style>
