import BaseEntity from '@/resources/entity/global/BaseEntity';
export default class Login extends BaseEntity {
  constructor(result) {
    super();
    const _data = result || {};
    this.name = _data.name || '';
    this.price = _data.price || 0;
    this.stockQuantity = _data.stockQuantity || 0;
    this.author = _data.author || '';
    this.isbn = _data.isbn || '';
  }
  insert() {
    return {
      name: this.name,
      price: this.price,
      stockQuantity: this.stockQuantity,
      author: this.author,
      isbn: this.isbn,
    };
  }
}
