<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>周边住宿详情</title>
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
        .table td {
            padding: 0.9rem 0.5rem;
        }
        .table th:nth-child(2), .table td:nth-child(2) {
            width: 180px;
        }
        .table th:nth-child(5), .table td:nth-child(5) {
            width: 250px;
        }
        .table th:nth-child(7), .table td:nth-child(7) {
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
            /*border: 1px solid #999;*/
            display: none;
            position: fixed;
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
                    <a class="nav-link" data-toggle="collapse" href="#ui-basic" aria-expanded="false" aria-controls="ui-basic">
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
                    <a class="nav-link" href="around_hotel.jsp">
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
                        周边住宿详情
                    </h3>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">所有推荐住宿</a></li>
                            <li class="breadcrumb-item active" aria-current="page">住宿管理</li>
                        </ol>
                    </nav>
                </div>
                <div class="col-lg-12 grid-margin stretch-card" style="padding: 0;">
                    <div class="card" >
                        <div class="card-body">
                            <h4 class="card-title">所有推荐住宿</h4>
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
                                                <th>图片</th>
                                                <th>项目名称</th>
                                                <th>价格</th>
                                                <th>距离景点</th>
                                                <th>地址</th>
                                                <th>评分</th>
                                                <th>周边操作</th>
                                            </tr>
                                            </thead>
                                            <tbody id="hotel_list_all">
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
<div class="container-scroller" id="delete_hotel">
    <!--动态加载-->
</div>
<!--修改弹框-->
<div class="container-scroller">
    <div id="cover_modify"></div>
    <div class="row" id="alert_modify">
        <div class="col-md-5 grid-margin stretch-card" style="margin: 0 auto">
            <div class="card">
                <div class="card-body" id="hotel_modify">
                    <h4 class="card-title" >修改内容</h4>
                    <hr>
                    <!--动态加载-->
                </div>
            </div>
        </div>
    </div>
</div>
<script>

    //TODO  获取所有酒店
    $(function () {
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/tour/hotelList'+window.location.search,
            dataType:"json",
            success:function (data) {
                //TODO  返回 列表 及 当前景点的名字
                hotelListLoad(data);//得到请求的页面数据  动态加载
            }
        });
    });
    // 景点周边酒店列表加载
    function hotelListLoad(data) {
        $('#view_name').text(`${data.viewName}`);
        for(var i=0;i<data.hotel.length;i++) {
        let con = $(` <tr>
                          <td><img src="../../images/all/${'${data.hotel[i].hotelImg}'}" class="view_img_main"></td>
                          <td>${'${data.hotel[i].hotelName}'}</td>
                          <td>${'${data.hotel[i].hotelPrice	}'}起</td>
                          <td>${'${data.hotel[i].hotelDistance}'}</td>
                          <td>${'${data.hotel[i].hotelAddress}'}</td>
                          <td><code class="text-warning">${'${data.hotel[i].hotelScore}'}</code></td>
                          <td style="width:106px">
                          <button type="button" class="btn btn-inverse-info btn-rounded btn-icon" onclick="showModWindow(${'${data.hotel[i].hotelId}'})">
                               <i class="mdi mdi-table-edit"></i>
                          </button>
                          <button type="button" class="btn btn-inverse-danger btn-rounded btn-icon" onclick="showDelWindow(${'${data.hotel[i].hotelId}'})">
                               <i class="mdi mdi-delete-forever"></i>
                           </button>
                          </td>
                     </tr>`);
            $('#hotel_list_all').append(con);
        }
    }

    //点击删除 确定  TODO 删除景点
    function DeleteHotel(id){
        console.log(id);
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/tour/hotelDelete',
            data:{
                hotelId:id
            },
            success:function () {
                // alert('删除成功');
                closeDelWindow();
                window.location.reload();
            }
        });
    }

    // TODO  打开修改弹窗   修改某个酒店 获取酒店信息
    function showModWindow(id) {
        console.log(id);
        // hotelModifyLoad(1);
        $.ajax({
            type:'GET',
            url:'http://localhost:8080/tour/hotelDetails',
            data:{
                hotelId:id
            },
            dataType:"json",
            success:function (data) {
                hotelModifyLoad(data);//修改弹框内容加载
                //TODO  修改提交后 后台重定向
            }
        });
        $('#alert_modify').show();  //显示弹窗
        $('#cover_modify').css('display','block'); //显示遮罩层
        $('#cover_modify').css('height',document.body.clientHeight+'px'); //设置遮罩层的高度为当前页面高度
    }
    //修改弹窗的加载
    function hotelModifyLoad(data){
        let con = $(`<form class="forms-sample" action="http://localhost:8080/tour/hotelModify" method="post">
                        <input type="hidden" name="hotelId" value="${'${data.hotelId}'}">
                        <div class="form-group">
                            <label for="InputName">酒店名字</label>
                            <input type="text" name="hotelName" class="form-control" id="InputName" placeholder="name" value="${'${data.hotelName}'}">
                        </div>
                        <div class="form-group">
                            <label for="InputPrice">价格</label>
                            <input type="text" name="hotelPrice"   class="form-control" id="InputPrice" placeholder="price" value="${'${data.hotelPrice}'}">
                        </div>
                        <div class="form-group">
                            <label for="InputDis">距离景点</label>
                            <input type="text" name="hotelDistance"  class="form-control" id="InputDis" placeholder="distance" value="${'${data.hotelDistance}'}">
                        </div>
                        <div class="form-group">
                            <label for="InputAddress">地址</label>
                            <input type="text" name="hotelAddress"  class="form-control" id="InputAddress" placeholder="address" value="${'${data.hotelAddress}'}">
                        </div>
                        <div class="form-group">
                            <label for="InputRecommend">评分</label>
                            <input type="text" name="hotelScore"  class="form-control" id="InputRecommend" placeholder="recommend" value="${'${data.hotelScore}'}">
                        </div>
                        <hr>
                        <div style="text-align: right;display: inline-block;">
                            <button type="submit" class="btn_sub btn btn-inverse-success btn-fw" >确 定</button>
                        </div>
                    </form>
                    <div style="text-align: right;display: inline-block;position: absolute;right: 30px;bottom: 15px;">
                        <button class="btn_sub btn btn-inverse-info btn-fw"  onclick="closeModWindow()">取消</button>
                    </div>`);
        $('#hotel_modify').append(con);
    }

    //删除的弹框加载
    function hotelDeleteLoad(hotelId) {
        console.log(hotelId);
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
                                    <button class="btn_sub btn btn-inverse-success btn-fw"  onclick="DeleteHotel(${'${hotelId}'})">确 定</button>
                                </div>
                            </div>
                         </div>
                        </div>
                 </div>`);
        $('#delete_hotel').append(con);
    }
    // 删除弹窗
    function showDelWindow(hotelId) {
        console.log(hotelId);
        hotelDeleteLoad(hotelId);
        $('#alert_del').show();  //显示弹窗
        $('#cover_del').css('display','block'); //显示遮罩层
        $('#cover_del').css('height',document.body.clientHeight+'px'); //设置遮罩层的高度为当前页面高度
    }
    // 关闭删除弹窗
    function closeDelWindow() {
        $('#alert_del').hide();  //隐藏弹窗
        $('#cover_del').css('display','none');   //显示遮罩层
    }
    // 关闭修改弹窗
    function closeModWindow() {
        $('#hotel_modify form').remove();
        $('#alert_modify').hide();  //隐藏弹窗
        $('#cover_modify').css('display','none');   //显示遮罩层
    }
</script>
<script src="../../js/search.js"></script>
<script src="../../vendors/js/vendor.bundle.base.js"></script>
<script src="../../vendors/js/vendor.bundle.addons.js"></script>
</body>
</html>