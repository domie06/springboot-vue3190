import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import address from '@/views/modules/address/list'
    import cart from '@/views/modules/cart/list'
    import dangao from '@/views/modules/dangao/list'
    import dangaoCollection from '@/views/modules/dangaoCollection/list'
    import dangaoCommentback from '@/views/modules/dangaoCommentback/list'
    import dangaoOrder from '@/views/modules/dangaoOrder/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryDangao from '@/views/modules/dictionaryDangao/list'
    import dictionaryDangaoCollection from '@/views/modules/dictionaryDangaoCollection/list'
    import dictionaryDangaoOrder from '@/views/modules/dictionaryDangaoOrder/list'
    import dictionaryDangaoOrderPayment from '@/views/modules/dictionaryDangaoOrderPayment/list'
    import dictionaryDiqu from '@/views/modules/dictionaryDiqu/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryIsdefault from '@/views/modules/dictionaryIsdefault/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionaryRenqun from '@/views/modules/dictionaryRenqun/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryDangao',
        name: '商品类型',
        component: dictionaryDangao
    }
    ,{
        path: '/dictionaryDangaoCollection',
        name: '收藏表类型',
        component: dictionaryDangaoCollection
    }
    ,{
        path: '/dictionaryDangaoOrder',
        name: '订单类型',
        component: dictionaryDangaoOrder
    }
    ,{
        path: '/dictionaryDangaoOrderPayment',
        name: '订单支付类型',
        component: dictionaryDangaoOrderPayment
    }
    ,{
        path: '/dictionaryDiqu',
        name: '地区',
        component: dictionaryDiqu
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryIsdefault',
        name: '是否默认地址',
        component: dictionaryIsdefault
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionaryRenqun',
        name: '适宜人群',
        component: dictionaryRenqun
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/address',
        name: '收货地址',
        component: address
      }
    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dangao',
        name: '商品',
        component: dangao
      }
    ,{
        path: '/dangaoCollection',
        name: '商品收藏',
        component: dangaoCollection
      }
    ,{
        path: '/dangaoCommentback',
        name: '商品评价',
        component: dangaoCommentback
      }
    ,{
        path: '/dangaoOrder',
        name: '商品订单',
        component: dangaoOrder
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
