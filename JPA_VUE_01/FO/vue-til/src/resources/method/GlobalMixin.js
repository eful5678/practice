import Vue from 'vue';

Vue.mixin({
  methods: {
    routerNext: function (config) {
      this.$router.push(config);
    },
  },
});
