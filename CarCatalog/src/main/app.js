/**
 * Created by Kirill on 14.12.2015.
 */
Ext.application({
    name: 'CarCatalog',
    launch: function () {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype: 'panel',
                html: '<h2>Каталог автомобилей</h2>'
            }
        });
    }
});
Ext.application({
    name: 'CarCatalog',

    views: [
        'AddCarFormView',
        'CarCatalogView',
        'CarGridView',
        'SearchCarView'
    ],

    launch: function () {
        Ext.create('Ext.container.Viewport', {
            layout: 'fit',
            items: {
                xtype  : 'carCatalogView'
            }
        });
    }
});