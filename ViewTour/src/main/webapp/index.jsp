<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>逛吃逛吃</title>
  <link rel="stylesheet" href="vendors/iconfonts/mdi/css/materialdesignicons.min.css">
  <link rel="stylesheet" href="vendors/css/vendor.bundle.base.css">
  <link rel="stylesheet" href="css/style.css">
  <link rel="shortcut icon" href="images/favicon.png" />
  <style>
    .navbar.default-layout-navbar .navbar-brand-wrapper .navbar-brand img {
      width: 200px;
      height: 65px;
    }
    .card.card-img-holder {
      position: relative;
      height: 140px;
    }

  </style>
</head>
<body>
    <div class="container-scroller">
      <!-- partial:partials/_navbar.html -->
      <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row" style=" border-bottom: 1px solid #cccccc;">
        <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
          <a class="navbar-brand brand-logo" href="index.jsp"><img src="images/logo.png" alt="logo"/></a>
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
                  <img src="images/faces/face1.jpg" alt="image">
                  <span class="availability-status online"></span>
                </div>
                <div class="nav-profile-text">
                  <p class="mb-0 text-black">个人中心</p>
                </div>
              </a>
              <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">
                <a class="dropdown-item" href="./static/login/login.jsp">
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
                      <img src="images/faces/face4.jpg" alt="image" class="profile-pic">
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
                      <img src="images/faces/face3.jpg" alt="image" class="profile-pic">
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
                  <img src="images/faces/face1.jpg" alt="profile">
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
              <a class="nav-link" href="index.jsp">
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
                  <li class="nav-item"> <a class="nav-link" href="static/view/list_view.html">景点列表</a></li>
                  <li class="nav-item"> <a class="nav-link" href="static/view/add_view.html">添加景点</a></li>
                  <li class="nav-item"> <a class="nav-link" href="static/view/modify_view.html">删改景点</a></li>
                </ul>
              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="static/router/router_curd.html">
                <span class="menu-title">旅游路线管理</span>
                <i class="mdi mdi-assistant menu-icon"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="static/food/around_foods.html">
                <span class="menu-title">周边饮食管理</span>
                <i class="mdi mdi-heart-box-outline menu-icon"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="static/around_view/around_views.html">
                <span class="menu-title">周边景点管理</span>
                <i class="mdi mdi-assistant menu-icon"></i>
              </a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="static/hotel/around_hotel.html">
                <span class="menu-title">周边住宿管理</span>
                <i class="mdi mdi-apps menu-icon"></i>
              </a>
            </li>
          </ul>
        </nav>
      <!-- partial -->
      <div class="main-panel">
        <div class="content-wrapper">
          <div class="page-header">
            <h3 class="page-title">
              <span class="page-title-icon bg-gradient-danger text-white mr-2">
                <i class="mdi mdi-home"></i>                 
              </span>
              首页
            </h3>
            <nav aria-label="breadcrumb">
              <ul class="breadcrumb">
                <li class="breadcrumb-item active" aria-current="page">
                  <span></span>view
                  <i class="mdi mdi-alert-circle-outline icon-sm text-primary align-middle"></i>
                </li>
              </ul>
            </nav>
          </div>
          <div class="row">
            <div class="col-md-4 stretch-card grid-margin">
              <div class="card card-img-holder bg-gradient-primary text-black" style="opacity: .8">
                <div class="card-body card_body_item">
                  <img src="images/dashboard/circle.svg" class="card-img-absolute" alt="circle-image"/>
                  <h4 class="font-weight-normal mb-3">景点数
                    <i class="mdi mdi-chart-line mdi-24px float-right"></i>
                  </h4>
                  <h4 class="mb-5"> 1500</h4>
                </div>
              </div>
            </div>
            <div class="col-md-4 stretch-card grid-margin">
              <div class="card card-img-holder bg-gradient-danger text-black" style="opacity: .8">
                <div class="card-body card_body_item">
                  <img src="images/dashboard/circle.svg" class="card-img-absolute" alt="circle-image"/>                  
                  <h4 class="font-weight-normal mb-3">周边数
                    <i class="mdi mdi-bookmark-outline mdi-24px float-right"></i>
                  </h4>
                  <h4 class="mb-5">4563</h4>
                </div>
              </div>
            </div>
            <div class="col-md-4 stretch-card grid-margin">
              <div class="card card-img-holder bg-gradient-success text-black" style="opacity: .8">
                <div class="card-body card_body_item">
                  <img src="images/dashboard/circle.svg" class="card-img-absolute" alt="circle-image"/>                                    
                  <h4 class="font-weight-normal mb-3">浏览人数
                    <i class="mdi mdi-diamond mdi-24px float-right"></i>
                  </h4>
                  <h4 class="mb-5">95574</h4>
                </div>
              </div>
            </div>
          </div>

          <div class="row">
            <div class="col-12 grid-margin">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">景点热度排行</h4>
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th>
                           景点名
                          </th>
                          <th>
                            地理位置
                          </th>
                          <th>
                            推荐原因
                          </th>
                          <th>
                            浏览次数
                          </th>
                          <th>
                            周边个数
                          </th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>
                            <img src="images/dashboard/img_1.jpg" class="mr-2" alt="image">
                            太行山
                          </td>
                          <td>
                           太行山
                          </td>
                          <td>
                            <label class="badge badge-gradient-success">山高</label>
                          </td>
                          <td>
                            20232
                          </td>
                          <td>
                            232
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="images/dashboard/img_2.jpg" class="mr-2" alt="image">
                            回民街
                          </td>
                          <td>
                            雁塔区
                          </td>
                          <td>
                            <label class="badge badge-gradient-warning">好吃</label>
                          </td>
                          <td>
                            2066
                          </td>
                          <td>
                            2321
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="images/dashboard/img_3.jpg" class="mr-2" alt="image">
                            秦岭动物园
                          </td>
                          <td>
                            秦岭
                          </td>
                          <td>
                            <label class="badge badge-gradient-info">好玩</label>
                          </td>
                          <td>
                            2017
                          </td>
                          <td>
                            232
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <img src="images/dashboard/img_4.jpg" class="mr-2" alt="image">
                            陕西历史博物馆
                          </td>
                          <td>
                            碑林区
                          </td>
                          <td>
                            <label class="badge badge-gradient-danger">历史</label>
                          </td>
                          <td>
                            99999
                          </td>
                          <td>
                            3332
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-7 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <div class="clearfix">
                    <h4 class="card-title float-left">浏览指数</h4>
                    <div id="visit-sale-chart-legend" class="rounded-legend legend-horizontal legend-top-right float-right"></div>
                  </div>
                  <canvas id="visit-sale-chart" class="mt-4"></canvas>
                </div>
              </div>
            </div>
            <div class="col-md-5 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">景点热度</h4>
                  <canvas id="traffic-chart"></canvas>
                  <div id="traffic-chart-legend" class="rounded-legend legend-vertical legend-bottom-left pt-4"></div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">旅游推荐展示</h4>
                  <div class="d-flex">
                    <div class="d-flex align-items-center mr-4 text-muted font-weight-light">
                      <i class="mdi mdi-account-outline icon-sm mr-2"></i>
                      <span>小本</span>
                    </div>
                    <div class="d-flex align-items-center text-muted font-weight-light">
                      <i class="mdi mdi-clock icon-sm mr-2"></i>
                      <span>2019/9/18</span>
                    </div>
                  </div>
                  <div class="row mt-3">
                    <div class="col-6 pr-1">
                      <img src="images/dashboard/img_1.jpg" class="mb-2 mw-100 w-100 rounded" alt="image">
                      <img src="images/dashboard/img_4.jpg" class="mw-100 w-100 rounded" alt="image">
                    </div>
                    <div class="col-6 pl-1">
                      <img src="images/dashboard/img_2.jpg" class="mb-2 mw-100 w-100 rounded" alt="image">
                      <img src="images/dashboard/img_3.jpg" class="mw-100 w-100 rounded" alt="image">
                    </div>
                  </div>
                  <div class="d-flex mt-5 align-items-top">
                    <img src="images/faces/face3.jpg" class="img-sm rounded-circle mr-3" alt="image">
                    <div class="mb-0 flex-grow">
                      <h5 class="mr-2 mb-2">推荐指数：☆☆☆☆</h5>
                      <p class="mb-0 font-weight-light">
                        好吃好玩好逛，适合朋友家人一起来玩
                       </p>
                    </div>
                    <div class="ml-auto">
                      <i class="mdi mdi-heart-outline text-muted"></i>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
          <div class="row">
            <div class="col-md-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">周边热度排行</h4>
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th>
                            Top
                          </th>
                          <th>
                            周边
                          </th>
                          <th>
                            地理位置
                          </th>
                          <th>
                            热度
                          </th>
                        </tr>
                      </thead>
                      <tbody>
                        <tr>
                          <td>
                            1
                          </td>
                          <td>
                            西安邮电大学
                          </td>
                          <td>
                            长安区
                          </td>
                          <td>
                            <div class="progress">
                              <div class="progress-bar bg-gradient-success" role="progressbar" style="width: 25%" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            2
                          </td>
                          <td>
                            如家酒店
                          </td>
                          <td>
                            智慧城
                          </td>
                          <td>
                            <div class="progress">
                              <div class="progress-bar bg-gradient-danger" role="progressbar" style="width: 75%" aria-valuenow="75" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            3
                          </td>
                          <td>
                            GOGO街区
                          </td>
                          <td>
                            长安区
                          </td>
                          <td>
                            <div class="progress">
                              <div class="progress-bar bg-gradient-warning" role="progressbar" style="width: 90%" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            4
                          </td>
                          <td>
                            杨铭宇黄焖鸡
                          </td>
                          <td>
                            航天城
                          </td>
                          <td>
                            <div class="progress">
                              <div class="progress-bar bg-gradient-primary" role="progressbar" style="width: 50%" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            5
                          </td>
                          <td>
                            蜜雪冰城
                          </td>
                          <td>
                            GOGO街区
                          </td>
                          <td>
                            <div class="progress">
                              <div class="progress-bar bg-gradient-danger" role="progressbar" style="width: 35%" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            6
                          </td>
                          <td>
                            永辉超市
                          </td>
                          <td>
                            西北政法大学对面
                          </td>
                          <td>
                            <div class="progress">
                              <div class="progress-bar bg-gradient-info" role="progressbar" style="width: 65%" aria-valuenow="65" aria-valuemin="0" aria-valuemax="100"></div>
                            </div>
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- content-wrapper ends -->
        <!-- partial:partials/_footer.html -->
        <footer class="footer">
          <div class="d-sm-flex justify-content-center justify-content-sm-between">
            <span class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright © 2019 <a href="" target="_blank">逛吃去哪儿</a>. All rights reserved. </span>
            <span class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">welcome you</span>
          </div>
        </footer>
        <!-- partial -->
      </div>
      <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
  </div>

  <script src="vendors/js/vendor.bundle.base.js"></script>
  <script src="vendors/js/vendor.bundle.addons.js"></script>

  <script src="js/off-canvas.js"></script>
  <script src="js/misc.js"></script>

  <script src="js/dashboard.js"></script>

</body>

</html>
