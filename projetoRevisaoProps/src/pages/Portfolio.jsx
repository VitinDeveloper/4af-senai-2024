import Carros from "../Components/Carros";
import Titulo from "../Components/Titulo"
import './Portfolio.css'

function Portfolio() {
    const carroes = [
        {
          id: Date.now(),
          modelo: 'Honda Civic',
          ano: 2022,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 1,
          modelo: 'Ford Mustang',
          ano: 2021,
          genero: 'Coupe'
        },
        {
          id: Date.now() + 2,
          modelo: 'Chevrolet Tahoe',
          ano: 2023,
          genero: 'SUV'
        },
        {
          id: Date.now() + 3,
          modelo: 'Toyota Corolla',
          ano: 2020,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 4,
          modelo: 'BMW X5',
          ano: 2022,
          genero: 'SUV'
        },
        {
          id: Date.now() + 5,
          modelo: 'Audi A4',
          ano: 2021,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 6,
          modelo: 'Mercedes-Benz C-Class',
          ano: 2022,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 7,
          modelo: 'Tesla Model 3',
          ano: 2023,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 8,
          modelo: 'Volkswagen Golf',
          ano: 2020,
          genero: 'Hatchback'
        },
        {
          id: Date.now() + 9,
          modelo: 'Hyundai Elantra',
          ano: 2021,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 10,
          modelo: 'Jeep Wrangler',
          ano: 2022,
          genero: 'SUV'
        },
        {
          id: Date.now() + 11,
          modelo: 'Chevrolet Camaro',
          ano: 2021,
          genero: 'Coupe'
        },
        {
          id: Date.now() + 12,
          modelo: 'Mazda CX-5',
          ano: 2023,
          genero: 'SUV'
        },
        {
          id: Date.now() + 13,
          modelo: 'Subaru Outback',
          ano: 2022,
          genero: 'SUV'
        },
        {
          id: Date.now() + 14,
          modelo: 'Ford Explorer',
          ano: 2023,
          genero: 'SUV'
        },
        {
          id: Date.now() + 15,
          modelo: 'Kia Sorento',
          ano: 2022,
          genero: 'SUV'
        },
        {
          id: Date.now() + 16,
          modelo: 'Nissan Altima',
          ano: 2021,
          genero: 'Sedan'
        },
        {
          id: Date.now() + 17,
          modelo: 'Toyota RAV4',
          ano: 2022,
          genero: 'SUV'
        }
      ];

    return (
        <div>
            <Titulo texto={"Portfólio"} emoji={"👀"} />
            <p>Estamos na página de Portfólio</p>

            <div className="carros">
                {carroes.map((carros) => (
                    <Carros carros={carros} key={carros.id}/>
                ))}
            </div>

        </div>
    )
}

export default Portfolio
