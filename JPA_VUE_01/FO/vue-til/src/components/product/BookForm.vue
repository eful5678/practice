<template>
  <div>
    <div>
      <label for="상품명"></label>
      <input type="text" />
    </div>
    <div>
      <label for="가격"></label>
    </div>
    <div>
      <label for="수량"></label>
    </div>
    <div>
      <label for="저자"></label>
    </div>
    <div>
      <label for="ISBN"></label>
    </div>
  </div>
</template>

<script>
import { Book } from '@/resources/entity/product';
export default {
  name: 'BookForm',
  data: () => ({
    book: {
      class: new Book(),
    },
  }),
};
</script>

<style></style>
