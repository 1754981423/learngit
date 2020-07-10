layui.use(['table','element','layer'],function () {
    var $ = layui.$,
        table = layui.table,
        layer = layui.layer,
        element = layui.element;
    $("#btnLoadData").click(loadData);

    function loadData() {
        table.render({
            elem: '#tabTest', url: 'goods/list',page:true
            , cols: [[{title: '编号', field: 'goodsId'}
                , {title: '标题', field: 'title'}
                , {title: '原价', field: 'originalCost'}
                , {title: '现价', field: 'currentPrice'}
                , {title: '则扣', field: 'discount'}

            ]]
        });
    }
})