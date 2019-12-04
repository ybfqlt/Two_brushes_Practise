<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>所有路线</title>
    <link rel="stylesheet" href="../../vendors/iconfonts/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="shortcut icon" href="../../images/favicon.png" />
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <style>
        .navbar.default-layout-navbar .navbar-brand-wrapper .navbar-brand img {
            width: 200px;
            height: 65px;
        }
        .table th, .table td {
            vertical-align: middle;
            font-size: 0.875rem;
            line-height: 1.5;
            min-width: 90px;
            text-align: left;
        }
        .table th{
            text-align: left;
        }

        .table th:nth-child(4), .table td:nth-child(4){
            text-align: center;
        }
        .grid-margin .card .view_img_main{
            width: 50px;
            height: 50px;
            border-radius: 5px;
        }
        .btn.btn-fw {
            min-width: 75px;
        }
        .btn {
            padding: 0.5rem;
        }
        .btn-inverse-danger a{
            color:#fe7c96;
        }
        .btn-inverse-success a{
            color: #1bcfb4
        }
        .btn-inverse-danger:hover a,.btn-inverse-success:hover a{
            text-decoration: none;
            color: white;
            background-color: white;
        }
        .btn i {
            font-size: 21px;
            font-weight: bolder;
        }
        .btn.btn-icon {
            width: 35px;
            height: 35px;
            padding: 0;
        }
        .btn-inverse-info{
            margin-right: 10px;
        }
        .card .card-body {
            padding: 1.5rem 2.5rem;
        }
        #cover_modify,#cover_del{
            width: 100%;
            height: 100%;
            background: #000;
            position: fixed;
            left: 0;
            top: 0;
            filter: alpha(opacity=30);
            opacity: 0.3;
            display: none;
            z-index: 2
        }
        #alert_modify,#alert_del{
            width: 100%;
            margin: 0 auto;
            height: 9.5rem;
            border: 1px solid #999;
            display: none;
            position:fixed;
            top: 40%;
            left: 10%;
            z-index: 3;
            background: transparent;
        }
        #exampleTextarea1{
            text-align: left;
        }
    </style>
</head>
<body>
<div class="container-scroller">
    <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row" style=" border-bottom: 1px solid #cccccc;">
        <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
            <a class="navbar-brand brand-logo" href="../../index.jsp"><img src="../../images/logo.png" alt="logo"/></a>
            <a class="navbar-brand brand-logo-mini" href="../../index.jsp"></a>
        </div>
        <div class="navbar-menu-wrapper d-flex align-items-stretch">
            <div class="search-field d-none d-md-block">
                <form class="d-flex align-items-center h-100" action="#">
                    <div class="input-group">
                        <div class="input-group-prepend bg-transparent">
                            <i class="input-group-text border-0 mdi mdi-magnify"></i>
                        </div>
                        <input type="text" class="form-control bg-transparent border-0" placeholder="Search projects">
                    </div>
                </form>
            </div>
            <ul class="navbar-nav navbar-nav-right">
                <li class="nav-item nav-profile dropdown">
                    <a class="nav-link dropdown-toggle" id="profileDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
                        <div class="nav-profile-img">
                            <img src="../../images/faces/face1.jpg" alt="image">
                            <span class="availability-status online"></span>
                        </div>
                        <div class="nav-profile-text">
                            <p class="mb-0 text-black">个人中心</p>
                        </div>
                    </a>
                    <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">
                        <a class="dropdown-item" href="../login/login.jsp">
                            <i class="mdi mdi-cached mr-2 text-success"></i>
                            登录
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">
                            <i class="mdi mdi-logout mr-2 text-primary"></i>
                            退出
                        </a>
                    </div>
                </li>
                <li class="nav-item d-none d-lg-block full-screen-link">
                    <a class="nav-link">
                        <i class="mdi mdi-fullscreen" id="fullscreen-button"></i>
                    </a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link count-indicator dropdown-toggle" id="messageDropdown" href="#" data-toggle="dropdown" aria-expanded="false">
                        <i class="mdi mdi-email-outline"></i>
                        <span class="count-symbol bg-warning"></span>
                    </a>
                    <div class="dropdown-menu dropdown-menu-right navbar-dropdown preview-list" aria-labelledby="messageDropdown">
                        <h6 class="p-3 mb-0">消息中心</h6>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <img src="../../images/faces/face4.jpg" alt="image" class="profile-pic">
                            </div>
                            <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                                <h6 class="preview-subject ellipsis mb-1 font-weight-normal">发送消息</h6>
                                <p class="text-gray mb-0">
                                    1 Minutes ago
                                </p>
                            </div>
                        </a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item preview-item">
                            <div class="preview-thumbnail">
                                <img src="../../images/faces/face3.jpg" alt="image" class="profile-pic">
                            </div>
                            <div class="preview-item-content d-flex align-items-start flex-column justify-content-center">
                                <h6 class="preview-subject ellipsis mb-1 font-weight-normal">发送消息</h6>
                                <p class="text-gray mb-0">
                                    18 Minutes ago
                                </p>
                            </div>
                        </a>
                        <div class="dropdown-divider"></div>
                        <h6 class="p-3 mb-0 text-center">4 new messages</h6>
                    </div>
                </li>
                <li class="nav-item nav-settings d-none d-lg-block">
                    <a class="nav-link" href="#">
                        <i class="mdi mdi-format-line-spacing"></i>
                    </a>
                </li>
            </ul>
            <button class="navbar-toggler navbar-toggler-right d-lg-none align-self-center" type="button" data-toggle="offcanvas">
                <span class="mdi mdi-menu"></span>
            </button>
        </div>
    </nav>
    <div class="container-fluid page-body-wrapper">
        <nav class="sidebar sidebar-offcanvas" id="sidebar">
            <ul class="nav">
                <li class="nav-item nav-profile">
                    <a href="#" class="nav-link">
                        <div class="nav-profile-image">
                            <img src="../../images/faces/face1.jpg" alt="profile">
                            <span class="login-status online"></span>
                        </div>
                        <div class="nav-profile-text d-flex flex-column">
                            <span class="font-weight-bold mb-2">小本</span>
                            <span class="text-secondary text-small">管理员</span>
                        </div>
                        <i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../../index.jsp">
                        <span class="menu-title">首页</span>
                        <i class="mdi mdi-home menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="../../static/view/list_view.jsp" aria-expanded="false" aria-controls="ui-basic">
                        <span class="menu-title">景点管理</span>
                        <i class="menu-arrow"></i>
                        <i class="mdi mdi-crosshairs-gps menu-icon"></i>
                    </a>
                    <div class="collapse" id="ui-basic">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"> <a class="nav-link" href="../view/list_view.jsp">景点列表</a></li>
                            <li class="nav-item"> <a class="nav-link" href="../view/add_view.jsp">添加景点</a></li>
                            <li class="nav-item"> <a class="nav-link" href="../view/modify_view.jsp">删改景点</a></li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="router_curd.jsp">
                        <span class="menu-title">旅游路线管理</span>
                        <i class="mdi mdi-assistant menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../food/around_foods.jsp">
                        <span class="menu-title">周边饮食</span>
                        <i class="mdi mdi-heart-box-outline menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../around_view/around_views.jsp">
                        <span class="menu-title">周边景点</span>
                        <i class="mdi mdi-assistant menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../hotel/around_hotel.jsp">
                        <span class="menu-title">周边住宿</span>
                        <i class="mdi mdi-apps menu-icon"></i>
                    </a>
                </li>

            </ul>
        </nav>
        <div class="main-panel">
            <div class="content-wrapper">
                <div class="page-header">
                    <h3 class="page-title">
                        旅游路线详情
                    </h3>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">所有推荐路线</a></li>
                            <li class="breadcrumb-item active" aria-current="page">路线管理</li>
                        </ol>
                    </nav>
                </div>
                <div class="col-lg-12 grid-margin stretch-card" style="padding: 0;">
                    <div class="card" >
                        <div class="card-body">
                            <h4 class="card-title">所有推荐路线</h4>
                            <h4 style="float: right;position: relative;top: -5%;"><a href="javascript:history.back(-1)">返回</a></h4>
                            <hr>
                            <div class="col-lg-12 grid-margin stretch-card">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="card-title" id="view_name">
                                            <!--动态加载-->
                                        </h4>
                                        <p class="card-description">
                                           需要注意：<code>系统只提供推荐</code>
                                        </p>
                                        <hr>
                                        <table class="table">
                                            <thead>
                                            <tr>
                                                <th>TOP</th>
                                                <th>推荐路线</th>
                                                <th>推荐原因</th>
                                                <th>操作</th>
                                            </tr>
                                            </thead>
                                            <tbody id="router_list">
                                                 <!--动态加载-->
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--删除弹框-->
<div class="container-scroller" id="delete_router">
    <!--动态加载-->
</div>
<!--修改弹框-->
<div class="container-scroller">
    <div id="cover_modify"></div>
    <div class="row" id="alert_modify">
        <div class="col-md-5 grid-margin stretch-card" style="margin: 0 auto">
            <div class="card">
                <div class="card-body" id="modify_router">
                    <h4 class="card-title" >修改内容</h4>
                    <hr>
                    <!--动态加载-->
                </div>
            </div>
        </div>
    </div>
</div>
<script>


    //TODO  获取所有路线
    $(function () {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/routerList'+window.location.search,
            dataType:"json",
            success:function (data) {
                loadList(data);//得到请求的页面数据  动态加载
            }
        });
    });
    //加载 路线列表
    function loadList(data) {
        $('#view_name').text(`${'${data.viewName}'}`);
        for (let i = 0; i < data.router.length; i++) {
            let con = $(`  <tr>
                                  <th>${'${i}'}</th>
                                  <td>${'${data.router[i].routerLine}'}</td>
                                  <td><label class="badge badge-success">${'${data.router[i].routerRecommend}'}</label></td>
                                  <td>
                                      <button type="button" class="btn btn-inverse-info btn-rounded btn-icon" onclick="showModWindow(${'${data.router[i].routerId}'})">
                                          <i class="mdi mdi-table-edit"></i>
                                      </button>
                                      <button type="button" class="btn btn-inverse-danger btn-rounded btn-icon" onclick="showDelWindow(${'${data.router[i].routerId}'})">
                                          <i class="mdi mdi-delete-forever"></i>
                                      </button>
                                  </td>
                             </tr>`);
            $('#router_list').append(con);
        }
    }
    //删除的弹框加载
    function routerDeleteLoad(routerId) {
        console.log(routerId);
        let con = $(`
                <div id="cover_del"></div>
                    <div class="row" id="alert_del">
                        <div class="col-md-5 grid-margin stretch-card" style="margin: 0 auto">
                            <div class="card" >
                            <div class="card-body">
                                <h4 class="card-title" >提示</h4>
                                <p>确认要删除吗?</p>
                                <hr>
                                <div style="text-align: right">
                                    <button class="btn_sub btn btn-inverse-info btn-fw"  onclick="closeDelWindow()">取消</button>
                                    <button class="btn_sub btn btn-inverse-success btn-fw"  onclick="deleteRouter(${'${routerId}'})">确 定</button>
                                </div>
                             </div>
                        </div>
                    </div>
                </div>`);
        $('#delete_router').append(con);
    }
    //修改的弹框加载
    function routerModifyLoad(data) {
        let con = $(`<form class="forms-sample" action="http://localhost:8080/routerModify" method="post">
                        <input type="hidden" name="routerId" value="${'${data.routerId}'}">
                        <div class="form-group">
                            <label for="routerLine">路线:</label>
                            <textarea class="form-control" name="routerLine" id="routerLine" rows="4">
                                ${'${data.routerLine}'}
                            </textarea>
                        </div>
                        <hr>
                            <div style="text-align: right;display: inline-block;">
                            <button class="btn_sub btn btn-inverse-success btn-fw">确 定</button>
                        </div>
                    </form>
                    <div style="text-align: right;display: inline-block;position: absolute;right: 30px;bottom: 15px;">
                        <button class="btn_sub btn btn-inverse-info btn-fw"  onclick="closeModWindow()">取消</button>
                    </div>`);
        $('#modify_router').append(con);
    }
    //TODO  删除 此路线 请求
    function deleteRouter(routerId) {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/routerDelete',
            data:{
                routerId:routerId
            },
            success:function () {
                closeDelWindow(); //关闭弹窗
                //TODO  后台重定向 刷新当前页面
            }
        });
    }

    // 删除弹窗
    function showDelWindow(routerId) {
        console.log(routerId);
        routerDeleteLoad(routerId);
        $('#alert_del').show();  //显示弹窗
        $('#cover_del').css('display','block'); //显示遮罩层
        $('#cover_del').css('height',document.body.clientHeight+'px'); //设置遮罩层的高度为当前页面高度
    }
    // 关闭删除弹窗
    function closeDelWindow() {
        $('#alert_del').hide();  //隐藏弹窗
        $('#cover_del').css('display','none');   //显示遮罩层
    }

    // 修改弹窗
    function showModWindow(routerId) {
        console.log(routerId);
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/routerDetails',
            data:{
                routerId:routerId
            },
            dataType:"json",
            success:function (data) {
                routerModifyLoad(data);//修改弹框内容加载
                //TODO  修改提交后 后台重定向
            }
        });
        $('#alert_modify').show();  //显示弹窗
        $('#cover_modify').css('display','block'); //显示遮罩层
        $('#cover_modify').css('height',document.body.clientHeight+'px'); //设置遮罩层的高度为当前页面高度
    }
    // 关闭修改弹窗
    function closeModWindow() {
        $('#alert_modify').hide();  //隐藏弹窗
        $('#cover_modify').css('display','none');   //显示遮罩层
    }
</script>
</body>
</html>