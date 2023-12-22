1-
{
Eğer Category entity'sini kaldırırsanız, Product entity'sindeki category alanı ile ilişkili olan kategori bilgisi kaybolacaktır.
Bu durumda, Product entity'sindeki kategori bilgisi boş kalacaktır ve mevcut ürünlerin hangi kategoriye ait olduğu bilgisi kaybolmuş olacaktır.

Bu değişiklik, genel veri bütünlüğünü etkiler ve veritabanınızdaki verilerin tutarlılığını bozabilir. 
Bu nedenle, Category entity'sini kaldırmadan önce, mevcut veritabanındaki ilişkileri ve verileri gözden geçirmeniz önemlidir.

Eğer kategori bilgisine gerçekten ihtiyaç duymuyorsanız ve Product entity'sindeki category alanını kullanmıyorsanız, 
  bu durumda Category entity'sini kaldırabilirsiniz. 
  
  Ancak, bu durumu dikkatlice değerlendirmeniz ve olası etkileri anlamanız önemlidir.

  => Bu sebeple Category Entity'sini kaldırmaktan vazgeçtim , tabloda 1-1 ilişki olarak kullanıcam bırakıcam , belki gelişmek istenirse proje , kategoriye yeni alt veya üst başlıklar eklenebilir. Kullanışlı hale gelebilir.
  }
2-
{
  Entityler arasında ManyToOne veya OneToMany - OneToOne ilişkilerini düzenledim.
  Cart ile OrderEntity arasındaki ilişkinin yanlış olduğunu düşünüyorum , Cart - Order ile ilişkilendirilmeli bence , ama bu düşüncemi şimdilik askıya aldım.
}
