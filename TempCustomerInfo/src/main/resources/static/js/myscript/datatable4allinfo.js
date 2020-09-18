let black_t4c_version = [];
let black_win_version = ['Windows Server 2003 Standard','Windows 7 Professional', 'Windows 7 Ultimate', 'Windows 8 Pro' ];

$(document).ready(function () {
  $('#allCustomers').dataTable({
    "order": [[1, 'asc']],
    "pageLength": 100,
    initComplete: function () {
      this.api().columns().every(function () {
        let column = this;
        let select = $(
            '<select  class="browser-default custom-select form-control-sm"><option value="" selected>Search</option></select>')
        .appendTo($(column.footer()).empty())
        .on('change', function () {
          let val = $.fn.dataTable.util.escapeRegex(
              $(this).val()
          );

          column
          .search(val ? '^' + val + '$' : '', true, false)
          .draw();
        });

        column.data().unique().sort().each(function (d, j) {
          select.append('<option value="' + d + '">' + d + '</option>')
        });
      });
    },
    "createdRow": function (row, data, dataIndex) {
      if (data[5] == '3.12.8.2') {
        /*
        $(row).find('td:eq(5)').addClass('bg-success');
        */
        $(row).addClass('bg-success');
      }
      if (data[5]=='3.2.7.19'){
        $(row).addClass('bg-info');
      }
     if (data[10] == 'false') {
        $(row).addClass('bg-danger');
      }
      if (black_win_version.includes(data[6]) && data[10] != 'false'){
        $(row).find('td:eq(6)').addClass('bg-warning');
      }
    }
  })
});