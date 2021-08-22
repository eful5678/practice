/**
 * Paging 공통 class
 */

export default class Paging {
  constructor(result) {
    const _data = result || {};
    // 현재 페이지
    this.offset = _data.offset || 1;
    // 1페이지당 갯수
    this.limit = _data.limit || 10;
    // 전체 row 수
    this.total = _data.total || 1;
    this.pagerage = 5;
  }
}
