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
    </div>
  </div>
</template>

<script>
import { Login } from '@/resources/entity/member';
import { searchUser } from '@/api/auth';
export default {
  data: () => ({
    member: {
      class: new Login(),
    },
  }),
  mounted() {
    this.search();
  },
  methods: {
    search: function () {
      console.log('search');
      searchUser().then(result => {
        console.log(result);
      });
    },
  },
};
</script>

<style></style>
