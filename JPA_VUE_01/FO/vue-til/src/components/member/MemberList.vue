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
            <td>{{ this.member.data[0].id }}</td>
            <td>{{ this.member.data[0].name }}</td>
            <!-- <td>{{ this.member.data[0].address.city }}</td>
            <td>{{ this.member.data[0].address.street }}</td>
            <td>{{ this.member.data[0].address.zipcode }}</td> -->
          </tr>
        </tbody>
      </table>
    </div>
    <!-- <div>{{ this.member.data[0].id }}</div>
    <div>{{ this.member }}</div> -->
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
        console.log(result.data.data);
        this.responseParse(this.member, result, this.member.class);
        console.log(this.member);
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
