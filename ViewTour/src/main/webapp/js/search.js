function load(e) {
    let theEvent = window.event || e;
    let code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    let val =$('#search').val();
    if (code === 13 && val !== '') {
        window.location.href = '../static/search.jsp?viewName='+ val;
    }
}