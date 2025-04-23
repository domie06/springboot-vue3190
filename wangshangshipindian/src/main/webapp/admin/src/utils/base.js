const base = {
    get() {
        return {
            url : "http://localhost:8080/wangshangshipindian/",
            name: "wangshangshipindian",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/wangshangshipindian/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上食品店"
        } 
    }
}
export default base
