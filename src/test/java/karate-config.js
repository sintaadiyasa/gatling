function fn() {
    var env = karate.env;
    var config = {
        urlBase: 'https://graphqlzero.almansi.me/api',
        basicAuth: 'https://graphqlzero.almansi.me/api',
    };
    karate.configure('connectTimeout', 100000);
    karate.configure('readTimeout', 100000);
    return config;
}