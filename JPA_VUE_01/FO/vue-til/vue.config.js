module.exports = {
  outputDir: '../../BO/jpashop/src/main/resources/static',
  indexPath: '../static/index.html',
  devServer: {
    port: 8084,
    proxy: 'http://localhost:8080',
  },
};
