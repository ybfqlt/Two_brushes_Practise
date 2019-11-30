<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>详情</title>
    <link rel="stylesheet" href="../../vendors/iconfonts/mdi/css/materialdesignicons.min.css">
    <link rel="stylesheet" href="../../vendors/css/vendor.bundle.base.css">
    <link rel="stylesheet" href="../../css/style.css">
    <link rel="shortcut icon" href="../../images/favicon.png" />
    <style>
        .navbar.default-layout-navbar .navbar-brand-wrapper .navbar-brand img {
            width: 200px;
            height: 65px;
        }
        .blockquote{
            margin: 10px 0;
        }
        .blockquote p{
            display: inline-block;
            font-size: .9375rem;
            line-height: 1.5;
        }
        .card-body{
            position: relative;
        }
        .media-body{
            margin-left:20px;
        }
        .card_item{
            border: 1px solid #cccccc;
        }
        .card_item .card_item_body{
            padding: 1.5rem;
        }
        .card-description{
            margin: 5px 0;
        }
        .card .card-description {
            margin-bottom: 0;
            font-family: "ubuntu-regular", sans-serif;
            color: #76838f;
        }
        .recommend_item{
            display: inline-block;
            padding-left: 5px;
        }

    </style>
</head>

<body>
<nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row" style=" border-bottom: 1px solid #cccccc;">
    <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
        <a class="navbar-brand brand-logo" href="../../index.jsp"><img src="../../images/logo.png" alt="logo"/></a>
        <a class="navbar-brand brand-logo-mini" href="../../index.jsp"><img src="../images/logo-mini.svg" alt="logo"/></a>
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
                <a class="nav-link" href="../router/router_curd.jsp">
                    <span class="menu-title">旅游路线管理</span>
                    <i class="mdi mdi-assistant menu-icon"></i>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="around_foods.jsp">
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
                    美食列表
                </h3>
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="#">美食详情</a></li>
                        <li class="breadcrumb-item active" aria-current="page">美食列表</li>
                    </ol>
                </nav>
            </div>
            <div class="col-md-12 grid-margin stretch-card">
                <div class="card" >
                    <div class="card-body" style="margin-top: 20px" id="food_content">
                        <!--动态加载-->
                    </div>
                    <div class="card-body" id="food_details">
                        <h5>美食展示</h5><br>
                        <!--动态加载-->
                    </div>
                    <hr>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    //TODO  获取当前美食的详情
    $(function () {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/foodInfo'+window.location.search,
            dataType:"json",
            success:function (data) {
                container_load(data);//得到请求的介绍数据  动态加载
            }
        });
    });

    function container_load(data) {
        let con = $(`
                        <h4 class="card-title text-info">${data.foodName}</h4>
                        <h4 style="float: right;position: relative;top: -15%;"><a href="javascript:history.back(-1)">返回</a></h4>
                        <hr>
                        <div class="desc_more">
                            <h5>美食介绍</h5>
                            <blockquote class="blockquote">
                                <p class="mb-0">
                                   ${data.foodDesc}
                                </p>
                            </blockquote>
                        </div>`);
        $('#food_content').append(con);
        let con1 = $(`
                        <img src="${data.foodImg}" width="300" href="200">
                        <div class="col-md-8 grid-margin stretch-card" style="display: inline-block;position: absolute;top: 16%;">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">${data.foodName}</h4>
                                    <hr>
                                    <ul class="list-ticked">
                                        <li>中文名 &nbsp;&nbsp;${data.foodChineseName}</li>
                                        <li>地 方 &nbsp;&nbsp;${data.foodLocate}</li>
                                        <li>口 味&nbsp;&nbsp;${data.foodTaste}</li>
                                        <li>最 早&nbsp;&nbsp;${data.foodOrigin}</li>
                                    </ul>
                                </div>
                            </div>
                        </div>`);
        $('#food_details').append(con);
    }
</script>
<script src="../../vendors/js/vendor.bundle.base.js"></script>
<script src="../../vendors/js/vendor.bundle.addons.js"></script>
</body>
</html>