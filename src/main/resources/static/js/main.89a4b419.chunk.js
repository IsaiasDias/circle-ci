(this.webpackJsonpfrontend=this.webpackJsonpfrontend||[]).push([[0],{41:function(e,t,c){},43:function(e,t,c){"use strict";c.r(t);var n=c(0),a=c.n(n),s=c(15),r=c.n(s),i=c(3),o=c(17),l=c(16),u=c.n(l),j=(c(41),c(1)),b=function(){var e=Object(n.useState)([]),t=Object(i.a)(e,2),c=t[0],a=t[1],s=Object(n.useState)(!0),r=Object(i.a)(s,2),l=r[0],b=r[1],d=Object(n.useState)("br"),O=Object(i.a)(d,2),f=O[0],h=O[1],m=function(e){u.a.get("http://localhost:8080/api/tweet/".concat(e)).then((function(e){a(e.data),b(!1)}))};Object(n.useEffect)((function(){m("br")}),[]);var x=function(e){b(!0),h(e),m(e)};return Object(j.jsxs)(j.Fragment,{children:[Object(j.jsxs)("div",{className:"menu",children:[Object(j.jsx)("label",{className:"br"===f&&"active",onClick:function(){return x("br")},children:"Brasil"}),Object(j.jsx)("label",{className:"us"===f&&"active",onClick:function(){return x("us")},children:"Estados Unidos"}),Object(j.jsx)("label",{className:"uk"===f&&"active",onClick:function(){return x("uk")},children:"Inglaterra"})]}),l?Object(j.jsx)("div",{className:"loader"}):Object(j.jsx)("div",{className:"container-tweets",children:c.map((function(e,t){return Object(j.jsx)(o.a,{tweetId:e},t)}))})]})};r.a.render(Object(j.jsx)(a.a.StrictMode,{children:Object(j.jsx)(b,{})}),document.getElementById("root"))}},[[43,1,2]]]);
//# sourceMappingURL=main.89a4b419.chunk.js.map