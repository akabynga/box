$(function() {
	$('body').on('click', '.page-scroll a', function(event) {
		var $anchor = $(this);
		if ($($anchor.attr('href')).length > 0) {
			$('html, body').stop().animate({
				scrollTop : $($anchor.attr('href')).offset().top
			}, 1500, 'easeInOutExpo');
			event.preventDefault();
		}
	});
});
