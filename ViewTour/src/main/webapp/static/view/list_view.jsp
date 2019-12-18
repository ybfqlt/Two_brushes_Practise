<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>景点列表</title>
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
        .btn a{
            color: white;
        }
        .btn a:hover{
            color: white;
            text-decoration: none;
        }
        .table tbody tr .desc {
            display: -webkit-box;
            -webkit-box-orient: vertical;
            -webkit-line-clamp: 3;
            overflow: hidden;
            max-height: 80px;
            text-align: left;
            border-bottom: none;
            border-left: none;
            border-right: none;
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
                        <input type="text" id="search" value="" class="form-control bg-transparent border-0" placeholder="按照景点名搜索" onkeydown="load()">
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
                            个人中心
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
                            <span class="font-weight-bold mb-2">${sessionScope.user}</span>
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
                    <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
                        <span class="menu-title">景点管理</span>
                        <i class="menu-arrow"></i>
                        <i class="mdi mdi-crosshairs-gps menu-icon"></i>
                    </a>
                    <div class="collapse" id="ui-basic">
                        <ul class="nav flex-column sub-menu">
                            <li class="nav-item"> <a class="nav-link" href="list_view.jsp">景点列表</a></li>
                            <li class="nav-item"> <a class="nav-link" href="add_view.jsp">添加景点</a></li>
                            <li class="nav-item"> <a class="nav-link" href="modify_view.jsp">删改景点</a></li>
                        </ul>
                    </div>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="../router/router_curd.jsp">
                        <span class="menu-title">旅游路线管理</span>
                        <i class="mdi mdi-assistant menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../food/around_foods.jsp">
                        <span class="menu-title">周边饮食管理</span>
                        <i class="mdi mdi-heart-box-outline menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../around_view/around_views.jsp">
                        <span class="menu-title">周边景点管理</span>
                        <i class="mdi mdi-assistant menu-icon"></i>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="../hotel/around_hotel.jsp">
                        <span class="menu-title">周边住宿管理</span>
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
                                    <th>景点介绍</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody id="view_all">

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    //TODO  获取所有景点 包括所有景点信息
    $(function () {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/tour/viewList',
            data:{
              flag:0
            },
            dataType:'json',
            success:function (data) {
                loads(data);//得到请求的页面数据  动态加载
            }
        });
    })
    //加载
    function loads(data) {
        for(var i=0; i<data.length; i++) {
            var con = $(`<tr>
                                <td><img src="../../images/all/${'${data[i].viewImg}'}" class="view_img_main"></td>
                                <td>${'${data[i].viewName}'}</td>
                                <td>${'${data[i].viewAddress}'}</td>
                                <td>${'${data[i].viewPrice}'}元</td>
                                <td>${'${data[i].viewDate}'}</td>
                                <td><label class="badge badge-success">${'${data[i].viewType}'}</label></td>
                                <td class="desc">${'${data[i].viewDesc}'}</td>
                                <td><button type="button" class="btn btn-gradient-danger"><a href="/static/view/detail_view.jsp?viewId=${'${data[i].viewId}'}">查看详情</a></button></td>
                           </tr>`);
            $('#view_all').append(con);
        }
    }
</script>
<script src="../../js/search.js"></script>
<script src="../../vendors/js/vendor.bundle.base.js"></script>
<script src="../../vendors/js/vendor.bundle.addons.js"></script>
</body>
</html>