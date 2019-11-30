<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>逛吃逛吃</title>
    <link rel="stylesheet" href="../../vendors/iconfonts/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="shortcut icon" href="../../images/favicon.png" />
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <style>
        .table th, .table td {
            vertical-align: middle;
            font-size: 0.875rem;
            line-height: 1.5;
            min-width: 90px;
        }
        .navbar.default-layout-navbar .navbar-brand-wrapper .navbar-brand img {
            width: 200px;
            height: 65px;
        }
        .grid-margin .card .view_img_main{
            width: 50px;
            height: 50px;
            border-radius: 5px;
        }
        .table-bordered thead th {
            text-align: center;
        }
        .table-bordered tbody td {
            text-align: center;
        }
        .btn.btn-fw {
            min-width: 75px;
        }
        .btn {
            padding: 0.5rem;
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
        #cover_modify,#cover_del{
            width: 100%;
            height: 100%;
            background: #000;
            position: absolute;
            left: 0;
            top: 0;
            filter: alpha(opacity=30);
            opacity: 0.3;
            display: none;
            z-index: 2
        }
        #alert_modify{
            width: 100%;
            margin: 0 auto;
            height: 9.5rem;
            border: 1px solid #999;
            display: none;
            position:fixed;
            top: 17%;
            left: 10%;
            z-index: 3;
            background: transparent;
        }
        #alert_del{
            width: 100%;
            margin: 0 auto;
            height: 9.5rem;
            border: 1px solid #999;
            display: none;
            position: fixed;
            top: 40%;
            left: 10%;
            z-index: 3;
            background: transparent;
        }
    </style>
</head>
<body>
<div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row" style=" border-bottom: 1px solid #cccccc;">
        <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
            <a class="navbar-brand brand-logo" href="../../index.html"><img src="../../images/logo.png" alt="logo"/></a>
            <a class="navbar-brand brand-logo-mini" href="../../index.html"><img src="../images/logo-mini.svg" alt="logo"/></a>
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
                        <a class="dropdown-item" href="../login/login.html">
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
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_sidebar.html -->
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
                    <a class="nav-link" href="../../index.html">
                        <span class="menu-title">首页</span>
                        <i class="mdi mdi-home menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                        <span class="menu-title">景点管理</span>
                        <i class="menu-arrow"></i>
                        <i class="mdi mdi-crosshairs-gps menu-icon"></i>
                    </a>
                    <div class="collapse" id="ui-basic">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"> <a class="nav-link" href="list_view.html">景点列表</a></li>
                            <li class="nav-item"> <a class="nav-link" href="add_view.html">添加景点</a></li>
                            <li class="nav-item"> <a class="nav-link" href="../static/modify_view.html">删改景点</a></li>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../router/router_curd.html">
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
                        景点管理
                    </h3>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">景点列表</a></li>
                            <li class="breadcrumb-item active" aria-current="page">景点管理</li>
                        </ol>
                    </nav>
                </div>
                <div class="col-lg-12 grid-margin stretch-card" style="padding: 0;">
                    <div class="card" >
                        <div class="card-body">
                            <h4 class="card-title">景点列表</h4>
                            <h4 style="float: right;position: relative;top: -13%;"><a href="javascript:history.back(-1)">返回</a></h4>
                            <hr>
                            <table class="table  table-bordered">
                                <thead>
                                <tr>
                                    <th>图片</th>
                                    <th>项目名称</th>
                                    <th>景点位置</th>
                                    <th>门票价钱</th>
                                    <th>开发时间</th>
                                    <th>景点类别</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody id="view_list_all">

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!--删除弹框-->
<div class="container-scroller" id="delete_view"></div>
<!--修改弹框-->
<div class="container-scroller">
    <div id="cover_modify"></div>
    <div class="row" id="alert_modify">
        <div class="col-md-5 grid-margin stretch-card" style="margin: 0 auto">
            <div class="card">
                <div class="card-body" id="modify_view">
                    <h4 class="card-title" >修改内容</h4>
                    <hr>

                </div>
            </div>
        </div>
    </div>
</div>
<script>

    //TODO  获取所有景点
    $(function () {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/viewList',
            dataType:"json",
            success:function (data) {
                viewListLoad(data);//得到请求的页面数据  动态加载
            }
        });
    });

    //点击删除 确定  TODO 删除景点
    function DeleteView(id){
        console.log(id);
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/viewDelete',
            data:{
                viewId:id
            },
            success:function () {
                alert('删除成功');
                closeDelWindow();
            }
        });
    }

    // TODO  打开修改弹窗   修改某个景点 获取景点信息
    function showModWindow(id) {
        console.log(id);
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/viewDetails',
            data:{
                viewId:id
            },
            dataType:"json",
            success:function (data) {
                viewModifyLoad(data);//删除弹框内容加载
                //TODO  修改提交后 后台重定向
            }
        });
        $('#alert_modify').show();  //显示弹窗
        $('#cover_modify').css('display','block'); //显示遮罩层
        $('#cover_modify').css('height',document.body.clientHeight+'px'); //设置遮罩层的高度为当前页面高度
    }
    // 关闭修改弹窗
    function closeModWindow() {
        $('#modify_view form').remove();
        $('#alert_modify').hide();  //隐藏弹窗
        $('#cover_modify').css('display','none');   //显示遮罩层
    }

    //景点列表加载
    function viewListLoad(data) {
        for(let i=0;i<data.length;i++) {
            let con =  $(`<tr>
                                <td><img src="${data[i].viewImg}" class="view_img_main"></td>
                                <td>${data[i].viewName}</td>
                                <td>${data[i].viewAddress}</td>
                                <td>${data[i].viewPrice}元</td>
                                <td>${data[i].viewDate}</td>
                                <td><label class="badge badge-danger">${data[i].viewType}</label></td>
                                <td class="desc">${data[i].viewDesc}</td>
                                <td>
                                      <button type="button" class="btn btn-inverse-info btn-rounded btn-icon" onclick="showModWindow(${data[i].viewId})">
                                         <i class="mdi mdi-table-edit"></i>
                                      </button>
                                      <button type="button" class="btn btn-inverse-danger btn-rounded btn-icon" onclick="showDelWindow(${data[i].viewId})">
                                         <i class="mdi mdi-delete-forever"></i>
                                      </button>
                                 </td>
                           </tr>`);
            $('#view_list_all').append(con);
        }
    }
    //修改的弹框加载
    function viewModifyLoad(data) {
        let con = $(`<form class="forms-sample" action="http://localhost:8080/viewModify" method="post">
                        <input type="hidden" name="viewId" value="${data.viewId}">
                        <div class="form-group">
                            <label for="InputName">景点名字</label>
                            <input type="text" name="viewName" class="form-control" id="InputName" placeholder="name" value="${data.viewName}">
                        </div>
                        <div class="form-group">
                            <label for="InputPrice">门票价格</label>
                            <input type="text" name="viewPrice" class="form-control" id="InputPrice" placeholder="price" value="${data.viewPrice}元">
                        </div>
                        <div class="form-group">
                            <label for="InputTime">开发时间</label>
                            <input type="text" name="viewDate" class="form-control" id="InputTime" placeholder="time" value="${data.viewDate}">
                        </div>
                        <div class="form-group">
                            <label for="InputAddress">景点位置</label>
                            <input type="text" name="viewAddress" class="form-control" id="InputAddress" placeholder="address" value="${data.viewAddress}">
                        </div>
                        <div class="form-group">
                            <label for="InputType">景点类别</label>
                            <input type="text" name="viewType" class="form-control" id="InputType" placeholder="recommend" value="${data.viewType}">
                        </div>
                         <hr>
                        <div style="text-align: right;display: inline-block;">
                            <button type="submit" class="btn_sub btn btn-inverse-success btn-fw" >确 定</button>
                        </div>
                    </form>
                    <div style="text-align: right;display: inline-block;position: absolute;right: 30px;bottom: 15px;">
                        <button class="btn_sub btn btn-inverse-info btn-fw"  onclick="closeModWindow()">取消</button>
                    </div>
               `);
        $(`#modify_view`).append(con);
    }
    //删除的弹框加载
    function viewDeleteLoad(viewId) {
        console.log(viewId);
        let con = $(` <div id="cover_del"></div>
                        <div class="row" id="alert_del">
                            <div class="col-md-5 grid-margin stretch-card" style="margin: 0 auto">
                                <div class="card">
                                 <div class="card-body" >
                                <h4 class="card-title" >提示</h4>
                                <p>确认要删除吗?</p>
                                <hr>
                                <div style="text-align: right">
                                    <button class="btn_sub btn btn-inverse-info btn-fw"  onclick="closeDelWindow()">取消</button>
                                    <button class="btn_sub btn btn-inverse-success btn-fw"  onclick="DeleteView(${viewId})">确 定</button>
                                </div>
                            </div>
                         </div>
                        </div>
                 </div>`);
        $('#delete_view').append(con);
    }

    // TODO 打开删除弹窗
    function showDelWindow(id) {
        console.log(id);
        viewDeleteLoad(id);  //加载 删除框
        $('#alert_del').show();  //显示弹窗
        $('#cover_del').css('display','block'); //显示遮罩层
        $('#cover_del').css('height',document.body.clientHeight+'px'); //设置遮罩层的高度为当前页面高度
    }
    // 关闭删除弹窗  点击取消
    function closeDelWindow() {
        $('#alert_del').hide();  //隐藏弹窗
        $('#cover_del').css('display','none');   //显示遮罩层
    }
</script>
<script src="../../vendors/js/vendor.bundle.base.js"></script>
<script src="../../vendors/js/vendor.bundle.addons.js"></script>

</body>
</html>