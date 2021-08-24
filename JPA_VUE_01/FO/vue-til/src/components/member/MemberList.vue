<template>
  <div>
    <h2>Member List</h2>
    <div>
      <table>
        <thead>
          <tr>
            <th>#</th>
            <th>이름</th>
            <th>도시</th>
            <th>주소</th>
            <th>우편번호</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>{{ member.class.id }}</td>
            <td>{{ member.class.name }}</td>
            <td>{{ member.class.city }}</td>
            <td>{{ member.class.street }}</td>
            <td>{{ member.class.zipcode }}</td>
          </tr>
        </tbody>
      </table>
      <div>{{ member }}</div>
      <div>{{ member.data }}</div>
      <div>{{ member.class }}</div>
    </div>
  </div>
</template>

<script>
import { Login } from '@/resources/entity/member';
import { searchUser } from '@/api/auth';
import { Response } from '@/resources/entity/global';
export default {
  data: () => ({
    member: {
      class: new Login(),
    },
  }),
  mounted() {
    this.search();
    console.log(this);
  },
  methods: {
    search: function () {
      console.log('search');
      searchUser().then(result => {
        console.log(result);
        this.responseParse(this.member, result, this.member.class);
      });
    },
    responseParse(dataArea, _data, _class) {
      // return new Response(_data).data.parse(_class);
      Object.assign(dataArea, new Response(_data).parse(_class));
    },
  },
};
</script>

<style></style>
